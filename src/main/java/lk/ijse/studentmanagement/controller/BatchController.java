package lk.ijse.studentmanagement.controller;

import lk.ijse.studentmanagement.dto.BatchDto;
import lk.ijse.studentmanagement.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/batches")
public class BatchController {
    @Autowired
    private BatchService batchService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<BatchDto> getAllBatches() {
        return batchService.getAllBatches()    ;
    }

    @GetMapping(value="/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public BatchDto getCustomer(@PathVariable("name")String name) {
        return batchService.getBatch(name);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody BatchDto batchDto) {
        return batchService.saveBatch(batchDto);
    }

    }
