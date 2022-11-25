package com.example.entryTestP2.service.bookOnTape;

import com.example.entryTestP2.entity.BookOnTape;
import com.example.entryTestP2.repository.IBookOnTapeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookOnTapeService implements IBookOnTapeService {
    @Autowired
    private IBookOnTapeRepo bookOnTapeRepo;

    @Override
    public Iterable<BookOnTape> findAll() {
        return bookOnTapeRepo.findAll();
    }

    @Override
    public Optional<BookOnTape> findById(Long id) {
        return bookOnTapeRepo.findById(id);
    }

    @Override
    public BookOnTape save(BookOnTape bookOnTape) {
        return bookOnTapeRepo.save(bookOnTape);
    }
}
