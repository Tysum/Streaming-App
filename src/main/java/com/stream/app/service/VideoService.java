package com.stream.app.service;

import com.stream.app.entity.Videos;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {
    List<Videos> getAllVideos();
    Videos getVideoById(String id) throws Exception;
    Videos saveVideo(Videos video, MultipartFile files);
    Videos getVideoByTitle(String title) throws Exception;
}
