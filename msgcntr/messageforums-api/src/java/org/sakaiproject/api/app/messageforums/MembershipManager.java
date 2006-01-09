package org.sakaiproject.api.app.messageforums;

import java.util.List;
import java.util.Map;

public interface MembershipManager {
    
  /**
   * Get filtered members for course all/user/role/group<br>
   * Return hash map for direct access to members via id
   * (used in UI when for selected list items)<br>
   * Filter roles/groups which do not have members
   * @return map of members
   */
  public Map getFilteredCourseMembers(boolean filterFerpa);
  
  /**
   * Get all members for course all/user/role/group<br>
   * Return hash map for direct access to members via id
   * (used in UI when for selected list items)
   * @return map of members
   */
  public Map getAllCourseMembers(boolean filterFerpa);
  
  /**
   * get all users for course w/o filtering of FERPA enabled members
   * @return list of MembershipItems
   */
  public List getAllCourseUsers();
  
  /**
   * returns a list for UI
   * @param memberMap
   * @return list of members
   */
  public List convertMemberMapToList(Map memberMap);
  
}
