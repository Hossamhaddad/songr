package com.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
    @GetMapping("/albums")
    public String getAlbum(Model songs){
Album anathema=new Album("The Silent Enigma","Anathema",9,"54:37","https://upload.wikimedia.org/wikipedia/en/b/b6/Anathema_The_Silent_Enigma.jpg");
Album opeth=new Album("Blackwater Park","Opeth",8,"66:59","https://upload.wikimedia.org/wikipedia/en/4/45/Blackwaterpark.jpg");
Album alter=new Album("Blackbird","Alter Bridge",13,"59:17","https://upload.wikimedia.org/wikipedia/en/1/13/Alterbridge_blackbird.jpg");
List<Album> albums=new ArrayList<>();
albums.add(anathema);
albums.add(opeth);
albums.add(alter);
songs.addAttribute("albums",albums);
return "album.html";

    }
}
