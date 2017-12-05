package spring_framework.proselyte_net.lesson_10.collection_injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    List documentList;
    Set documentSet;
    Map documentMap;
    Properties documentProp;

    public List getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List documentList) {
        System.out.println("List of Documents: " + documentList);
        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        System.out.println("Set of Documents: " + documentSet);
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("Map of Documents: " + documentMap);
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        this.documentMap = documentMap;
    }

    public Properties getDocumentProp() {
        System.out.println("Property of Documents: " + documentProp);
        return documentProp;
    }

    public void setDocumentProp(Properties documentProp) {
        this.documentProp = documentProp;
    }
}
