package com.example.entryTestP2.controller;

import com.example.entryTestP2.entity.BookOnTape;
import com.example.entryTestP2.entity.Furniture;
import com.example.entryTestP2.entity.Thing;
import com.example.entryTestP2.entity.Video;
import com.example.entryTestP2.service.bookOnTape.IBookOnTapeService;
import com.example.entryTestP2.service.furniture.IFurnitureService;
import com.example.entryTestP2.service.video.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ThingController {
    @Autowired
    private IVideoService videoService;
    @Autowired
    private IBookOnTapeService bookOnTapeService;
    @Autowired
    private IFurnitureService furnitureService;

    public void insertVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serial number: ");
        Long serialNum = scanner.nextLong();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter description: ");
        String description = scanner.next();
        Video video = new Video(serialNum, name, description);
        videoService.save(video);
    }

    public void insertBookOnTape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serial number: ");
        Long serialNum = scanner.nextLong();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter description: ");
        String description = scanner.next();
        BookOnTape bookOnTape = new BookOnTape(serialNum, name, description);
        bookOnTapeService.save(bookOnTape);
    }

    public void insertFurniture() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serial number: ");
        Long serialNum = scanner.nextLong();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter description: ");
        String description = scanner.next();
        Furniture furniture = new Furniture(serialNum, name, description);
        furnitureService.save(furniture);
    }

    public void showMenu() {
        try {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("------Menu Insert------");
                System.out.println("1. Insert Thing");
                System.out.println("2. Find thing by serial number");
                System.out.println("3. Exit");
                System.out.println("----------------");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        showMenuInsert();
                        break;
                    case 2:
                        Scanner serialNumber = new Scanner(System.in);
                        System.out.print("Enter Serial Number: ");
                        Long serial = serialNumber.nextLong();
                        System.out.println("Detail : "+lookUp(serial));
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("[❌] Nhập sai lựa chọn, thử lại");
                        break;

                }
            } while (true);
        } catch (Exception e) {
            System.out.println("[❌] Bạn đã nhập sai dữ liệu! Vui lòng nhập lại!");
            System.out.println("---------------------------------");
        }
    }

    public void showMenuInsert() {
        try {
            do {
                System.out.println("------Menu------");
                System.out.println("1. Insert Video");
                System.out.println("2. Insert Book On Tape");
                System.out.println("3. Insert Furniture");
                System.out.println("4. Back to main menu");
                System.out.println("----------------");
                System.out.print("Enter choice: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        insertVideo();
                        break;
                    case 2:
                        insertBookOnTape();
                        break;
                    case 3:
                        insertFurniture();
                        break;
                    case 4:
                        showMenu();
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("[❌] Bạn đã nhập sai dữ liệu! Vui lòng nhập lại!");
            System.out.println("---------------------------------");
        }
    }

    public String lookUp(Long serialNumber) {
        List<Video> videoList = (List<Video>) videoService.findAll();
        List<BookOnTape> bookOnTapeList = (List<BookOnTape>) bookOnTapeService.findAll();
        List<Furniture> furnitures = (List<Furniture>) furnitureService.findAll();
        String description = "";
        for (Video video : videoList) {
            if (serialNumber.equals(video.getSerialNumber())) {
                description = video.getDescription();
            }
        }
        for (BookOnTape bookOnTape : bookOnTapeList) {
            if (serialNumber.equals(bookOnTape.getSerialNumber())) {
                description = bookOnTape.getDescription();
            }
        }
        for (Furniture furniture : furnitures) {
            if (serialNumber.equals(furniture.getSerialNumber())) {
                description = furniture.getDescription();
            }
        }
        return description;
    }
}
