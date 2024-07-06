package com.vineet.LogsIngestor.service;

import com.vineet.LogsIngestor.dto.FilterDto;
import com.vineet.LogsIngestor.dto.LogDto;
import com.vineet.LogsIngestor.exception.ApiException;
import com.vineet.LogsIngestor.pojo.Log;

import java.io.IOException;
import java.util.List;

public interface LogsService {

    void produceLog(LogDto logDto) throws ApiException;
    void consumeAndSaveLogs(List<Log> log) throws ApiException, IOException;
    List<LogDto> searchLogs(String searchString, FilterDto filter) throws ApiException;
}
