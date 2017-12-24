package spring_framework.wideskills_com.lesson_11.xml;

import java.util.List;
import java.util.Set;

public class Country {
    private List<String> statesName ;
    private List<State> statesList ;
    private Set<State> statesSet ;

    public List<String> getStatesName() {
        return statesName;
    }
    public void setStatesName(List<String> statesName) {
        this.statesName = statesName;
    }
    public List<State> getStatesList() {
        return statesList;
    }
    public void setStatesList(List<State> statesList) {
        this.statesList = statesList;
    }
    public Set<State> getStatesSet() {
        return statesSet;
    }
    public void setStatesSet(Set<State> statesSet) {
        this.statesSet = statesSet;
    }
}
