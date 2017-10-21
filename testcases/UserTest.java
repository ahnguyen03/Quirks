public class UserTest {

  public testGetFriendsList() {
    User friend1 = new User("alex");
    User friend2 = new User("jordan");

    ArrayList<User> list = new ArrayList<User>(Arrays.asList(friend1, friend2));
    User user1 = new User("enzo", list);

    assertEquals(user1.getFriendsList(), list);
  }

  public testAddFriend() {
    User user1 = new User("enzo");
    User user2 = new User("alex");
    user1.addFriend(user2);
    ArrayList<User> friendslist = user1.getFriendsList();
    assertTrue(friendslist.contains(user2));
  }

  public testDeleteFriend() {
    User user1 = new User("enzo");
    User user2 = new User("alex");
    user1.addFriend(user2);
    user2.deleteFriend(user2);
    ArrayList<User> friendslist = user1.getFriendsList();
    assertFalse(friendslist.contains(user2));
  }

  public testGetQuirkList() {
    Quirk myQuirk = new Quirk("eating", "eat less", 10);
    ArrayList<Quirk> quirklist = new ArrayList<Quirk>();
    quirklist.add(myQuirk);
    ArrayList<User> friendlist = new ArrayList<QUser>();
    User user1 = new User("enzo", friendlist, quirklist);

    ArrayList<Quirk> returnedQuirkList = user1.getQuirkList();
    AssertEquals(returnedQuirkList, quirklist);
  }

  public testAddQuirkToUser() {
    Quirk myQuirk = new Quirk("eating", "eat less", 10);
    ArrayList<Quirk> quirklist = new ArrayList<Quirk>();
    ArrayList<User> friendlist = new ArrayList<QUser>();
    User user1 = new User("enzo", friendlist, quirklist);
    user1.addQuirk(myQuirk);

    ArrayList<Quirk> returnedQuirkList = user1.getQuirkList();
    AssertEquals(returnedQuirkList, quirklist);
  }

  public testDeleteQuirkFromUser() {
    Quirk myQuirk = new Quirk("eating", "eat less", 10);
    ArrayList<Quirk> quirklist = new ArrayList<Quirk>();
    ArrayList<User> friendlist = new ArrayList<QUser>();
    User user1 = new User("enzo", friendlist, quirklist);
    user1.deleteQuirk(myQuirk);

    ArrayList<Quirk> returnedQuirkList = user1.getQuirkList();
    AssertEquals(returnedQuirkList, quirklist);
  }
}
