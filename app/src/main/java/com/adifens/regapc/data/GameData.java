package com.adifens.regapc.data;

import com.adifens.regapc.Game;

import java.util.ArrayList;

public class GameData {
    public static String[][] data = new String[][] {
            {"Grand Theft Auto V", "Grand Theft Auto V adalah game aksi dan petualangan yang dikembangkan oleh Rockstar North dan di terbitkan oleh Rockstar Games. Game ini terbit pada tanggal 17 september 2013 untuk console Playstation 3 dan Xbox 360. Game ini adalah game kelima belas dari seluruh game GTA.",
                    "https://asset.kompas.com/crops/vfcLTwgL8KTscWmoYYduCgE9S9I=/0x0:0x0/750x500/data/photo/2013/09/19/1106257GTA-V-bigp.jpg"},

            {"The Witcher 3: Wild Hunt", "The Witcher 3: Wild Hunt adalah permainan video bermain peran yang dikembangkan oleh CD Projekt RED pada tahun 2015 dan diterbitkan oleh CD Projekt.",
                    "https://images.gog.com/60c724a052275a049d857d53957dc38e9347742f52372bb956d992b43efa8fb5_product_card_v2_mobile_slider_639.jpg"},

            {"Red Dead Redemption 2", "Red Dead Redemption 2 adalah game aksi-petualangan yang dikembangkan dan diterbitkan oleh Rockstar Games. Ini dirilis untuk PlayStation 4 dan Xbox One pada Oktober 2018, dan untuk Microsoft Windows pada November 2019.",
                    "https://cdn1.thr.com/sites/default/files/imagecache/768x433/2018/09/red_dead_redemption_2_-_publicity_-_h_2018.jpg"},

            {"FIFA 20", "FIFA 20 adalah permainan video simulasi sepakbola yang diterbitkan oleh Electronic Arts sebagai bagian dari seri FIFA. Ini adalah angsuran ke-27 dalam seri FIFA, dan dirilis pada 27 September 2019 untuk Microsoft Windows, PlayStation 4, Xbox One, dan Nintendo Switch.",
                    "https://cdn0-production-images-kly.akamaized.net/kgOD0uwzvxhOoYKMDGDwM6Wm8iY=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2932049/original/099576100_1570419831-Ilustrasi_FIFA_20.jpg"},

            {"PES 2020", "eFootball Pro Evolution Soccer 2020 adalah permainan video simulasi sepak bola yang dikembangkan oleh PES Productions dan diterbitkan oleh Konami untuk Microsoft Windows, PlayStation 4, Xbox One, Android dan IOS.",
                    "http://www.goodgame.hr/wp-content/uploads/2019/09/eFootball-Pro-Evolution-Soccer-2020-1.jpg"},

            {"Fortnite", "Fortnite adalah sebuah permainan video tahun 2017 yang dikembangkan oleh Epic Games yang dirilis sebagai paket perangkat lunak terpisah yang menyajikan berbagai mode permainan.",
                    "https://img.etimg.com/thumb/msid-71577143,width-643,imgsize-500325,resizemode-4/fortnite.jpg"},

            {"PUBG", "PlayerUnknown's Battlegrounds adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.",
                    "https://cdn1-production-images-kly.akamaized.net/8Y3LmBRFGbmO67kyYPayJbmUp_M=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2514400/original/014338600_1543878323-PUBG-Mobile-update.jpg"},

            {"Watch Dogs 2", "Watch Dogs 2 adalah game aksi-petualangan yang dikembangkan oleh Ubisoft Montreal dan diterbitkan oleh Ubisoft. Ini adalah sekuel Watch Dogs 2014 dan dirilis untuk PlayStation 4, Xbox One, dan Microsoft Windows pada November 2016.",
                    "http://jagatplay.com/wp-content/uploads/2016/07/watch-dogs-2-600x338-1-600x338.jpg"},

            {"Monster Hunter: World", "Monster Hunter: World adalah game role-playing aksi yang dikembangkan dan diterbitkan oleh Capcom. Sebagai bagian dari seri Monster Hunter, dirilis di seluruh dunia untuk PlayStation 4 dan Xbox One pada Januari 2018, dengan versi Microsoft Windows pada Agustus 2018.",
                    "https://hb.imgix.net/ed4f625cb724e20763d1305ee8b912f15ddae6f9.jpg?auto=compress,format&fit=crop&h=353&w=616&s=992df905bb2aecc2fb1761b53955b228"},

            {"Death Stranding", "Death Stranding adalah game aksi yang dikembangkan oleh Kojima Productions. Ini adalah game pertama dari sutradara Hideo Kojima dan Kojima Productions setelah pembubaran mereka dari Konami pada tahun 2015.",
                    "https://steamcdn-a.akamaihd.net/steam/apps/1190460/header.jpg?t=1574285579"},

    };



    public static ArrayList<Game> getListData() {
        ArrayList<Game> list = new ArrayList<>();

        for(String[] row : data) {
            Game game = new Game();

            game.setNama(row[0]);
            game.setDeskripsi(row[1]);
            game.setFoto(row[2]);

            list.add(game);
        }

        return list;
    }
}

