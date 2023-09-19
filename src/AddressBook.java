public class AddressBook {

    private void removeBuddy(BuddyInfo buddy) {
    }

    private void addBuddy(BuddyInfo buddy) {
    }



    public static void main(String[] args){
    BuddyInfo buddy = new BuddyInfo("tom", "carleton", 613);
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(buddy);
}



}



