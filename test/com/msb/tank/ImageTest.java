package com.msb.tank;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

//相对路劲基于classPath，即src目录

class ImageTest {
    @Test
    void test() {
        try {
            BufferedImage image = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("images/tank.png"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}