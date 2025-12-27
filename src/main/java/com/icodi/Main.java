package com.icodi;

import com.icodi.adapter.HdmiVgaAdapter;
import com.icodi.adapter.HdmiVgaAdapterH;
import com.icodi.computer.Ecran;
import com.icodi.computer.UniteCentrale;
import com.icodi.computer.VideoProjecteur;
import com.icodi.tv.TV;

public class Main {
    public static void main(String[] args) {

        UniteCentrale uniteCentrale = new UniteCentrale();

        System.out.println("1. Test avec ECRAN (Standard)");
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour\n");

        System.out.println("2. Test avec VIDEO PROJECTEUR (Standard)");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour\n");

        System.out.println("3. Test avec TV via ADAPTATEUR (Héritage)");
        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentrale.setVga(hdmiVgaAdapterH);
        uniteCentrale.print("Bonjour TV via Héritage\n");

        System.out.println("4. Test avec TV via ADAPTATEUR (Composition)");
        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        TV tv = new TV();
        adapter.setHdmi(tv);
        uniteCentrale.setVga(adapter);
        uniteCentrale.print("Bonsoir TV via la Composition\n");
    }
}