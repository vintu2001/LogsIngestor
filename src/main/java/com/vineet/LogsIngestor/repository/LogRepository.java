package com.vineet.LogsIngestor.repository;

import com.vineet.LogsIngestor.pojo.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(rollbackFor = Exception.class)
public interface LogRepository extends MongoRepository<Log, String> {

}