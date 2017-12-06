package spring_framework.proselyte_net.lesson_12.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {
    @Autowired
    @Qualifier("javaDeveloper")
    private Developer developer;

    public Position() {
    }

    public void getDevelopersInfo(){
        System.out.println(this.developer);
    }
}
