package lk.ijse.studentmanagement.service;

import lk.ijse.studentmanagement.dto.BatchDto;

import java.util.ArrayList;

public interface BatchService {
    public ArrayList<BatchDto> getAllBatches();
    public BatchDto getBatch(String batchId);
    public boolean saveBatch(BatchDto batchDto);
    public BatchDto searchBatch(String id);
}
