package com.example.entryTestP2.service.video;

import com.example.entryTestP2.entity.Video;
import com.example.entryTestP2.repository.IVideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class VideoService implements IVideoService {
    @Autowired
    private IVideoRepo videoRepo;

    @Override
    public Iterable<Video> findAll() {
        return videoRepo.findAll();
    }

    @Override
    public Optional<Video> findById(Long id) {
        return videoRepo.findById(id);
    }

    @Override
    public Video save(Video video) {
        return videoRepo.save(video);
    }
}
