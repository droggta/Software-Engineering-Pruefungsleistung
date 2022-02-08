public class ReceiverModule {

    CentralUnit aCentralUnit;
    int door;

    /**
     * Creates a ReceiverModule and declares the corresponding centralUnit
     * @param centralUnit
     */
    public ReceiverModule(CentralUnit centralUnit, int doorID){
        aCentralUnit = centralUnit;
        door = doorID;
    }

    /**
     * Scans and reads an IDCard
     * @param card
     */
    public void readIdCard(IdCard card){
        aCentralUnit.receiveIDCardString(card.getaEncryptedString());
    }
}
