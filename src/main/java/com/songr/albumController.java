package com.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
    @Autowired
    AlbumRepository albumRepository;



    @GetMapping("/albums")
    public String getAlbum(Model songs){
//Album anathema=new Album("The Silent Enigma","Anathema",9,"54:37","https://upload.wikimedia.org/wikipedia/en/b/b6/Anathema_The_Silent_Enigma.jpg");
//Album opeth=new Album("Blackwater Park","Opeth",8,"66:59","https://upload.wikimedia.org/wikipedia/en/4/45/Blackwaterpark.jpg");
//Album alter=new Album("Blackbird","Alter Bridge",13,"59:17","https://upload.wikimedia.org/wikipedia/en/1/13/Alterbridge_blackbird.jpg");
//List<Album> albums=new ArrayList<>();
//albums.add(anathema);
//albums.add(opeth);
//albums.add(alter);
songs.addAttribute("albums",albumRepository.findAll());
return "album.html";
    }
    @GetMapping("/addAlbum")
    public String getAddAlbumPage(){
        return "addAlbum.html";
    }
    @PostMapping("/albums")
    public RedirectView addNewAlbum(@RequestParam (value ="artist") String artist,
                                    @RequestParam (value ="title") String title,
                                    @RequestParam (value ="songCount") int songCount,
                                    @RequestParam (value ="length") String length,
                                    @RequestParam (value ="imageUrl") String imageUrl
                                    ){

        Album album=new Album(artist,title,songCount,length,imageUrl);
        albumRepository.save(album);
        return  new RedirectView("/albums");
    }
}
