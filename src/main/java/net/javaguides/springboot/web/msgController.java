package net.javaguides.springboot.web;


import net.javaguides.springboot.Données.DAOmsg;
import net.javaguides.springboot.model.msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class msgController {

    @Autowired
    private DAOmsg daOmsg;

    @GetMapping("/")
    public String show_msg(Model model){

        model.addAttribute("list_msg", daOmsg.findAll());
        model.addAttribute("nvx_msg", new msg());
        return "index";


    }

@PostMapping("/")
    public String get_msg(@ModelAttribute msg newmsg){
        msg MESG  = new msg (newmsg.getId(), newmsg.getNom(), newmsg.getPrenom(), newmsg.getTel(), newmsg.getAge(), newmsg.getRdv(), newmsg.getDate());
        daOmsg.save(MESG);

    return "index";

}



@PostMapping("/{id}")
    public String del_msg(@PathVariable Long id){
        daOmsg.deleteById(id);

    return "index";

}

}
