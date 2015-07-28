package arshsingh93.una.model;

import com.parse.ParseObject;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 7/25/2015.
 */
public class Group {
    private List<ParseUser> groupMembers;
    private List<ParseUser> groupModMembers;
    //private ParseFile for a photo?
    //list of blogs?

    public Group(String theName, String theType) {
        ParseObject group = new ParseObject("Group");
        group.put("groupName", theName);
        group.put("groupType", theType); //TODO call method that adjusts for private/secret groups.
        groupMembers = new ArrayList<>();
        group.put("groupMemberList", groupMembers);
        groupModMembers = new ArrayList<>();
        group.put("groupModerators", groupModMembers); //TODO add the groups creator to the mod and member lists.

        
    }


    //TODO if the group type is private or secret then adjust readability and writeability accordingly. CREATE A METHOD

    //TODO method to update the type of group this is (public/private/secret)

    //TODO method to add or remove members

    //TODO method to add or remove moderators.


}
