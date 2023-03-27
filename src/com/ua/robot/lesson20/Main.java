package com.ua.robot.lesson20;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("свобода", List.of("freedom", "Freiheit", "kamardikan"));
        map.put("краса", List.of("beauty", "Schönheit", "kaendahan"));
        map.put("гідність", List.of("dignity", "Würde", "kamulyan"));
        map.put("приватність", List.of("privacy", "Privatsphäre", "kamardikan"));
        map.put("міць", List.of("power", "Macht", "daya"));
        map.put("захист", List.of("security", "Sicherheit", "kamardikan"));
        map.put("виробництво", List.of("production", "Produktion", "produksi"));
        map.put("слава", List.of("glory", "Ruhm", "kamulyan"));
        map.put("мужність", List.of("courage", "Mut", "wani"));

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
