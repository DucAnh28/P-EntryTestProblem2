package com.example.entryTestP2.repository;

import com.example.entryTestP2.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideoRepo extends JpaRepository<Video, Long> {
}
