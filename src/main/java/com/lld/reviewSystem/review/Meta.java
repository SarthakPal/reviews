package com.lld.reviewSystem.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;

@Getter
@Setter
@AllArgsConstructor
public class Meta {
    private long reviewId;
    private BufferedImage reviewImages;
    private String imagePath;
}
