package net.javaguides.springboot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class msg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private Integer age;
    private String rdv;
    private String date;






    public msg( Long id, String nom,String prenom, String tel, Integer age, String rdv, String date){
        this.id = id;
        this.nom= nom;
        this.prenom= prenom;
        this.tel= tel;
        this.age= age;
        this.rdv= rdv;
        this.date= date;

    }


    public msg(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public String getRdv(){
        return rdv;
    }
    public void setRdv(String rdv){
        this.rdv = rdv;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }


    }