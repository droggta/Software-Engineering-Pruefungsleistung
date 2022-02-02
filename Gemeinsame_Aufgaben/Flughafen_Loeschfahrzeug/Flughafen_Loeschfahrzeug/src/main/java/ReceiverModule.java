public class ReceiverModule {

    CentralUnit aCentralUnit;

    /**
     * Creates a ReceiverModule and declares the corresponding centralUnit
     * @param centralUnit
     */
    public ReceiverModule(CentralUnit centralUnit){
        aCentralUnit = centralUnit;
    }

    public void readIdCard(IdCard card){
        aCentralUnit.decipherString(card.getaEncryptedString());
    }
}
