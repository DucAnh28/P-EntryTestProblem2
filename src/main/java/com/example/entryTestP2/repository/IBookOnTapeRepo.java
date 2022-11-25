package com.example.entryTestP2.repository;

import com.example.entryTestP2.entity.BookOnTape;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookOnTapeRepo extends JpaRepository<BookOnTape,Long> {

}
