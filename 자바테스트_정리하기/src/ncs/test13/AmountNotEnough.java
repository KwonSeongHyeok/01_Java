package ncs.test13;
// extends Exception
public class AmountNotEnough extends Exception {
	// ���� ������� ���� �� ǥ���ϴ� ������ �����ڰ� ������� ��
	public AmountNotEnough (String msg) {
		// if new Throws
		
		/*
		 * for(Inventory �κ��丮 : inventoryMap.values()) {
			if(�κ��丮.getGetAmoun() > �κ��丮.getPutAmount()) {
				throw new AmountNotEnough("��� ������ ��� ������ �ʰ��߽��ϴ�.");
			}
		}
		 */
		
		super(msg);
	}

}
