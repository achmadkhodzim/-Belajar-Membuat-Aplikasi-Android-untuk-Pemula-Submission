package com.example.dicodings;

import java.util.ArrayList;

public class KarakterData {
    public static String[][] data = new String[][]{
            {"Mario", "Originally a carpenter named Jumpman, this Italian plumber has gone on to become the most recognizable video game character of them all, starring in a veritable pantheon of titles like kart racing and sports. He has been voiced by Charles Martinet for nearly 20 years.", "https://static.giantbomb.com/uploads/square_small/15/153607/2555000-2339414779-Mario.png"},
            {"Luigi", "Luigi is Mario's brother. He began as a simple palette swap of Mario, but was later differentiated. In his later forays, he provides comic relief.", "https://static.giantbomb.com/uploads/square_small/9/99864/2389814-nsmbuluigi.png"},
            {"Princess Peach", "Princess Peach Toadstool is usually the damsel in distress from the Mario franchise. She gets kidnapped frequently by Bowser, though she's not averse to being captured by various other villains from time to time.", "https://static.giantbomb.com/uploads/square_small/0/7003/204916-peachmp8a.png"},
            {"Toad", "The Toad is a member of the Toad species. He is a loyal attendant of Princess Peach and often assists Mario on his journeys in a variety of ways.", "https://static.giantbomb.com/uploads/square_small/9/95666/1907632-new_super_mario_bros._wii_toad.png"},
            {"Donkey Kong","The Original Donkey Kong made his debut in the game of the same name, where he tossed barrels at his nemesis Mario. His grandson, Donkey Kong Jr., went on to create a legacy of his own in games such as Donkey Kong Country and Donkey Kong Country Tropical Freeze.", "https://static.giantbomb.com/uploads/square_small/0/1410/180443-donkey_kong_en_smash_bros_brawl.jpg"},
            {"Big Boo", "Basically, he's the big Boo. The leader of the legions of Boo, even though he has an equally big problem with shyness as his underlings.", "https://static.giantbomb.com/uploads/square_small/0/2898/279511-big_boo.gif"},
            {"Lemmy Koopa","Lemmy is the second oldest of Bowser's eight children. He always appears somewhat dizzy.", "https://static.giantbomb.com/uploads/square_small/1/17172/1191015-lemmykoopa.jpg"},
            {"Iggy Koopa","Iggy is the fourth oldest son of Bowser, a member of the koopalings, and a crazy genius.", "https://static.giantbomb.com/uploads/square_small/1/17172/1191020-iggy.jpg"},
            {"Kirby","Kirby is the hero of Dream Land, who fights the evil King Dedede.", "https://static.giantbomb.com/uploads/square_small/0/25/176094-newssuggest_y4lewep2.jpg"},
            {"Wa Luigi", "Luigi's dark counterpart, who is mainly known for appearing in Mario spinoffs. He is voiced by Charles Martinet. Enjoys playing a game of tennis with Wario.", "https://static.giantbomb.com/uploads/square_small/0/1410/180301-waluigi2.jpg"},
    };
    public static ArrayList<Karakter> getListData(){
        ArrayList<Karakter> list = new ArrayList<>();
        for (String[] aData : data) {
            Karakter karakter = new Karakter();
            karakter.setName(aData[0]);
            karakter.setFrom(aData[1]);
            karakter.setPhoto(aData[2]);
            list.add(karakter);
        }
        return list;
    }
}