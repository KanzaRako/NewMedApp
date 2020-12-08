package net.javaguides.springboot.Données;



import net.javaguides.springboot.model.msg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface DAOmsg extends JpaRepository <msg, Long> {
}
