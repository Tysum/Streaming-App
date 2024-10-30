package com.stream.app.service.ServiceImplementation;

import com.stream.app.entity.Videos;
import com.stream.app.repository.VideoRepository;
import com.stream.app.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {

    @Value("${files.video}")
    String folderName;

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Videos> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Videos getVideoById(String id) throws Exception {
        Optional<Videos> video = videoRepository.findById(id);
        if (video.isPresent()) {
            return video.get();
        }
        throw new Exception("Video not found");
    }

    @Override
    public Videos saveVideo(Videos video, MultipartFile files) {
        try {
            String fileName = files.getOriginalFilename();
            String contentType = files.getContentType();
            InputStream inputStream = files.getInputStream();

            String cleanFileName = StringUtils.cleanPath(folderName + fileName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Videos getVideoByTitle(String title) throws Exception {
        Optional<Videos> video = videoRepository.findByTitle(title);
        if (video.isPresent()) {
            return video.get();
        }
        throw new Exception("Video title not found");
    }
}
