package sample1;
import org.apache.hadoop.hive.ql.exec.UDF;
public class MasterCmp extends UDF {
	boolean result = false;
	CmpAdr ca = new CmpAdr();
	CmpCity cc = new CmpCity();
	CmpState cs =  new CmpState();
	CmpZip cz = new CmpZip();
	
public boolean evaluate(String crpsAdrLine1,String crpsAdrLine2,String triumphAdrLine1,String triumphAdrLine2,String crpsCity,String triumphCity,
		String crpsState,String triumphState,String crpsZip,String triumphZip) {
	
	result = ca.compareAdr(crpsAdrLine1, crpsAdrLine2, triumphAdrLine1, triumphAdrLine2) && cc.compareCity(crpsCity, triumphCity) &&
			cs.compareState(crpsState, triumphState) && cz.compareZip(crpsZip, triumphZip);

	
return result;


}

}
