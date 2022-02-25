public class ReceiverModule {

    final CentralUnit aCentralUnit;
    final int door;

    /**
     * Creates a ReceiverModule and declares the corresponding centralUnit
     */
    public ReceiverModule(CentralUnit centralUnit, int doorID){
        aCentralUnit = centralUnit;
        door = doorID;
    }

    /**
     * Scans and reads an IDCard
     */
    public void readIdCard(IdCard card){
        aCentralUnit.receiveIDCardString(card.getaEncryptedString());
    }
}
