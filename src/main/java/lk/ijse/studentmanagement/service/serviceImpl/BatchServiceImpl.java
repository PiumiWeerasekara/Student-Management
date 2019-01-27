package lk.ijse.studentmanagement.service.serviceImpl;

import lk.ijse.studentmanagement.dto.BatchDto;
import lk.ijse.studentmanagement.entity.Batch;
import lk.ijse.studentmanagement.repository.BatchRepository;
import lk.ijse.studentmanagement.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BatchServiceImpl implements BatchService {
    @Autowired
    private BatchRepository batchRepository;
    @Override
    public ArrayList<BatchDto> getAllBatches() {
        List<Batch> all=batchRepository.findAll();
        ArrayList<BatchDto> alBtches=new ArrayList<>();
        for (Batch batch : all) {
            BatchDto batchDto=new BatchDto(
                    batch.getBatchID());
            alBtches.add(batchDto);
        }
        return alBtches;
    }

    @Override
    public BatchDto getBatch(String batchId) {
        Batch batch=batchRepository.findById(batchId).get();
        BatchDto batchDto=new BatchDto(batch.getBatchID(),batch.getCid());
        return batchDto;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean saveBatch(BatchDto batchDto) {

        Batch b=new Batch();
        b.setBatchID(batchDto.getBatchID());
        b.setCid(batchDto.getCid());

        batchRepository.save(b);
        return true;
    }

    @Override
    public BatchDto searchBatch(String id) {
        return null;
    }
}
