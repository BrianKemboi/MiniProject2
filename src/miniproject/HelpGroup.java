package miniproject;

import java.util.ArrayList;

public class HelpGroup {
    String groupName;
    String groupID;
    ArrayList<Person> groupMembers = new ArrayList<>();

    public HelpGroup (String groupName, String groupID){
        this.groupName = groupName;
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }
}
