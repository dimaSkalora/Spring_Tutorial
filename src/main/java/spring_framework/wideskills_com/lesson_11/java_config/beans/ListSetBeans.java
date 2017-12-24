package spring_framework.wideskills_com.lesson_11.java_config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.wideskills_com.lesson_11.java_config.Country;
import spring_framework.wideskills_com.lesson_11.java_config.State;

import java.util.*;

@Configuration
public class ListSetBeans {
    @Bean
    public State state1(){
        State state = new State();
        state.setName("United States");
        state.setCountryCode("+1");

        return state;
    }
    @Bean
    public State state2(){
        State state = new State();
        state.setName("United Kingdom");
        state.setCountryCode("+44");

        return state;
    }
    @Bean
    public State state3(){
        State state = new State();
        state.setName("India");
        state.setCountryCode("+91");

        return state;
    }

    @Bean
    public Country country(){
        Country country = new Country();
        List<String> listName = new ArrayList<>();
        listName.add("United States");
        listName.add("United Kingdom");
        listName.add("India");
        country.setStatesName(listName);

        List<State> listState = new ArrayList<>();
        listState.add(state1());
        listState.add(state2());
        listState.add(state1());
        listState.add(state3());
        country.setStatesList(listState);

        Set<State> setState = new HashSet<>();
        setState.add(state1());
        setState.add(state2());
        setState.add(state1());
        setState.add(state3());
        country.setStatesSet(setState);

        return country;
    }
}
