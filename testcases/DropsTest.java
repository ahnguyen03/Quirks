public class DropTest{
	
	public void testSetUser() {
		Drop drop = new drop("drop", "this is drop", "Rare");
		User user1 = new User("Alex");
		drop.setUser(user1);
		assertEquals(drop.getUser(),user1;
	}
	
	public void testGetUser() {
		Drop drop = new Drop("Drop1", "this is Drop1", "Common");
		User user1 = new User("Enzo");
		drop.setUser(user1);
		User returnedUser = drop.getUser();
		assertEquals(returnedUser, user1);
	}
	
	public void testGetRarity(){
		Drop drop = new Drop("Drop3", "this is Drop3", "Rare" );
		drop.setRarity("Rare drop");
		String rarity = drop.getRarity();
		assertEquals(rarity, "Rare drop");
	}
	
	public void testGetName(){
		Drop drop = new Drop("Drop5", "this is Drop5", "Semi rare");
		drop.setName("item");
		String dropName = drop.getName();
		assertEquals(dropName,"Drop5");
	}
	
	public void testTrade(){
		User user1 = new User("enzo");
		User user2 = new User("alex");
		
		Drop drop1 = new Drop("Drop1", "this is Drop1", "Common");
		Drop drop2 = new Drop("Drop2", "this is Drop2", "Semi rare");
		
		user1.setDropUser(drop1);
		user2.setDropUser(drop2);
		
		drop1.trade(user2,drop1);
		Drop drop_returned = user2.getDropUser(2);
		assertEquals(drop_returned.getName(), "Drop1");
	}

	public void testDropDetails(){
		Drop drop = new Drop("Drop 5", "this is Drop5", "Semi rare");
		String dropDetails = drop.dropDetails();

		assertEquals(dropDetails, "I am Drop 5")

	}
	
	
}