package Project5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jamesBondTest {
	jamesBond bond;
	boolean jamesBond;
	
	@Before
	public void setUp() throws Exception {
		bond = new jamesBond();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase0() { 
		jamesBond = bond.bondRegex("(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase1() { 
		jamesBond = bond.bondRegex("((");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase2() { 
		jamesBond = bond.bondRegex("(((");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase3() { 
		jamesBond = bond.bondRegex("(()");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase4() { 
		jamesBond = bond.bondRegex("((0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase5() { 
		jamesBond = bond.bondRegex("()");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase6() { 
		jamesBond = bond.bondRegex("()(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase7() { 
		jamesBond = bond.bondRegex("())");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase8() { 
		jamesBond = bond.bondRegex("()0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase9() { 
		jamesBond = bond.bondRegex("(0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase10() { 
		jamesBond = bond.bondRegex("(0(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase11() { 
		jamesBond = bond.bondRegex("(0((");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase12() { 
		jamesBond = bond.bondRegex("(0()");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase13() { 
		jamesBond = bond.bondRegex("(0(0");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase14() { 
		jamesBond = bond.bondRegex("(0)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase15() { 
		jamesBond = bond.bondRegex("(0)(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase16() { 
		jamesBond = bond.bondRegex("(0))");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase17() { 
		jamesBond = bond.bondRegex("(0)0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase18() { 
		jamesBond = bond.bondRegex("(00");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase19() { 
		jamesBond = bond.bondRegex("(00(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase20() { 
		jamesBond = bond.bondRegex("(00((");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase21() { 
		jamesBond = bond.bondRegex("(00()");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase22() { 
		jamesBond = bond.bondRegex("(00(0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase23() { 
		jamesBond = bond.bondRegex("(00)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase24() { 
		jamesBond = bond.bondRegex("(00)(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase25() { 
		jamesBond = bond.bondRegex("(00))");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase26() { 
		jamesBond = bond.bondRegex("(00)0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase27() { 
		jamesBond = bond.bondRegex("(000");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase28() { 
		jamesBond = bond.bondRegex("(000(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase29() { 
		jamesBond = bond.bondRegex("(000)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase30() { 
		jamesBond = bond.bondRegex("(0000");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase31() { 
		jamesBond = bond.bondRegex("(001(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase32() { 
		jamesBond = bond.bondRegex("(001)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase33() { 
		jamesBond = bond.bondRegex("(0010");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase34() { 
		jamesBond = bond.bondRegex("(002(");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase35() { 
		jamesBond = bond.bondRegex("(002)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase36() { 
		jamesBond = bond.bondRegex("(0020");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase37() { 
		jamesBond = bond.bondRegex("(003(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase38() { 
		jamesBond = bond.bondRegex("(003)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase39() { 
		jamesBond = bond.bondRegex("(0030");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase40() { 
		jamesBond = bond.bondRegex("(004(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase41() { 
		jamesBond = bond.bondRegex("(004)");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase42() { 
		jamesBond = bond.bondRegex("(0040");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase43() { 
		jamesBond = bond.bondRegex("(005(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase44() { 
		jamesBond = bond.bondRegex("(005)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase45() { 
		jamesBond = bond.bondRegex("(0050");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase46() { 
		jamesBond = bond.bondRegex("(006(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase47() { 
		jamesBond = bond.bondRegex("(006)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase48() { 
		jamesBond = bond.bondRegex("(0060");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase49() { 
		jamesBond = bond.bondRegex("(007(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase50() { 
		jamesBond = bond.bondRegex("(007((");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase51() { 
		jamesBond = bond.bondRegex("(007()");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase52() { 
		jamesBond = bond.bondRegex("(007(0");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase53() { 
		jamesBond = bond.bondRegex("(007)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase54() { 
		jamesBond = bond.bondRegex("(007)(");
		assertFalse(jamesBond); 
	}
	@Test
	public void testCase55() { 
		jamesBond = bond.bondRegex("(007)((");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase56() { 
		jamesBond = bond.bondRegex("(007)()");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase57() { 
		jamesBond = bond.bondRegex("(007)(0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase58() { 
		jamesBond = bond.bondRegex("(007))");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase59() { 
		jamesBond = bond.bondRegex("(007))(");
		assertFalse(jamesBond);
	}

	public void testCase60() { 
		jamesBond = bond.bondRegex("(007)))");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase61() { 
		jamesBond = bond.bondRegex("(007))0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase62() { 
		jamesBond = bond.bondRegex("(007)0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase63() { 
		jamesBond = bond.bondRegex("(007)0(");
		assertFalse(jamesBond);
	}
	
	@Test
	public void testCase64() { 
		jamesBond = bond.bondRegex("(007)0)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase65() { 
		jamesBond = bond.bondRegex("(007)00");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase66() { 
		jamesBond = bond.bondRegex("(007)1(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase67() { 
		jamesBond = bond.bondRegex("(007)1)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase68() { 
		jamesBond = bond.bondRegex("(007)10");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase69() { 
		jamesBond = bond.bondRegex("(007)2(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase70() { 
		jamesBond = bond.bondRegex("(007)2)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase71() { 
		jamesBond = bond.bondRegex("(007)20");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase72() { 
		jamesBond = bond.bondRegex("(007)3(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase73() { 
		jamesBond = bond.bondRegex("(007)3)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase74() { 
		jamesBond = bond.bondRegex("(007)30");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase75() { 
		jamesBond = bond.bondRegex("(007)4(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase76() { 
		jamesBond = bond.bondRegex("(007)4)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase77() { 
		jamesBond = bond.bondRegex("(007)40");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase78() { 
		jamesBond = bond.bondRegex("(007)5(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase79() { 
		jamesBond = bond.bondRegex("(007)5)");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase80() { 
		jamesBond = bond.bondRegex("(007)50");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase81() { 
		jamesBond = bond.bondRegex("(007)6(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase82() { 
		jamesBond = bond.bondRegex("(007)6)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase83() { 
		jamesBond = bond.bondRegex("(007)60");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase84() { 
		jamesBond = bond.bondRegex("(007)7(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase85() { 
		jamesBond = bond.bondRegex("(007)7)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase86() { 
		jamesBond = bond.bondRegex("(007)70");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase87() { 
		jamesBond = bond.bondRegex("(007)8(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase88() { 
		jamesBond = bond.bondRegex("(007)8)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase89() { 
		jamesBond = bond.bondRegex("(007)80");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase90() { 
		jamesBond = bond.bondRegex("(007)9(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase91() { 
		jamesBond = bond.bondRegex("(007)9)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase92() { 
		jamesBond = bond.bondRegex("(007)90");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase93() { 
		jamesBond = bond.bondRegex("(0070");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase94() { 
		jamesBond = bond.bondRegex("(0070(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase95() { 
		jamesBond = bond.bondRegex("(0070)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase96() { 
		jamesBond = bond.bondRegex("(00700");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase97() { 
		jamesBond = bond.bondRegex("(0071(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase98() { 
		jamesBond = bond.bondRegex("(0071)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase99() { 
		jamesBond = bond.bondRegex("(00710");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase100() { 
		jamesBond = bond.bondRegex("(0072(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase101() { 
		jamesBond = bond.bondRegex("(0072)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase102() { 
		jamesBond = bond.bondRegex("(00720");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase103() { 
		jamesBond = bond.bondRegex("(0073(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase104() { 
		jamesBond = bond.bondRegex("(0073)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase105() { 
		jamesBond = bond.bondRegex("(00730");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase106() { 
		jamesBond = bond.bondRegex("(0074(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase107() { 
		jamesBond = bond.bondRegex("(0074)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase108() { 
		jamesBond = bond.bondRegex("(00740");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase109() { 
		jamesBond = bond.bondRegex("(0075(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase110() { 
		jamesBond = bond.bondRegex("(0075)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase111() { 
		jamesBond = bond.bondRegex("(00750");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase112() { 
		jamesBond = bond.bondRegex("(0076(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase113() { 
		jamesBond = bond.bondRegex("(0076)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase114() { 
		jamesBond = bond.bondRegex("(00760");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase115() { 
		jamesBond = bond.bondRegex("(0077(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase116() { 
		jamesBond = bond.bondRegex("(0077)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase117() { 
		jamesBond = bond.bondRegex("(00770");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase118() { 
		jamesBond = bond.bondRegex("(0078(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase119() { 
		jamesBond = bond.bondRegex("(0078)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase120() { 
		jamesBond = bond.bondRegex("(00780");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase121() { 
		jamesBond = bond.bondRegex("(0079(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase122() { 
		jamesBond = bond.bondRegex("(0079)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase123() { 
		jamesBond = bond.bondRegex("(00790");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase124() { 
		jamesBond = bond.bondRegex("(008(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase125() { 
		jamesBond = bond.bondRegex("(008)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase126() { 
		jamesBond = bond.bondRegex("(0080");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase127() { 
		jamesBond = bond.bondRegex("(009(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase128() { 
		jamesBond = bond.bondRegex("(009)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase129() { 
		jamesBond = bond.bondRegex("(0090");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase130() { 
		jamesBond = bond.bondRegex("(01(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase131() { 
		jamesBond = bond.bondRegex("(01)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase132() { 
		jamesBond = bond.bondRegex("(010");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase133() { 
		jamesBond = bond.bondRegex("(02(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase134() { 
		jamesBond = bond.bondRegex("(02)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase135() { 
		jamesBond = bond.bondRegex("(020");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase136() { 
		jamesBond = bond.bondRegex("(03(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase137() { 
		jamesBond = bond.bondRegex("(03)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase138() { 
		jamesBond = bond.bondRegex("(030");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase139() { 
		jamesBond = bond.bondRegex("(04(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase140() { 
		jamesBond = bond.bondRegex("(04)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase141() { 
		jamesBond = bond.bondRegex("(040");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase142() { 
		jamesBond = bond.bondRegex("(05(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase143() { 
		jamesBond = bond.bondRegex("(05)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase144() { 
		jamesBond = bond.bondRegex("(050");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase145() { 
		jamesBond = bond.bondRegex("(06(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase146() { 
		jamesBond = bond.bondRegex("(06)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase147() { 
		jamesBond = bond.bondRegex("(060");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase148() { 
		jamesBond = bond.bondRegex("(07(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase149() { 
		jamesBond = bond.bondRegex("(07)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase150() { 
		jamesBond = bond.bondRegex("(070");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase151() { 
		jamesBond = bond.bondRegex("(08(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase152() { 
		jamesBond = bond.bondRegex("(08)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase153() { 
		jamesBond = bond.bondRegex("(080");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase154() { 
		jamesBond = bond.bondRegex("(09(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase155() { 
		jamesBond = bond.bondRegex("(09)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase156() { 
		jamesBond = bond.bondRegex("(090");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase157() { 
		jamesBond = bond.bondRegex("(1(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase158() { 
		jamesBond = bond.bondRegex("(1)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase159() { 
		jamesBond = bond.bondRegex("(10");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase160() { 
		jamesBond = bond.bondRegex("(2(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase161() { 
		jamesBond = bond.bondRegex("(2)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase162() { 
		jamesBond = bond.bondRegex("(20");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase163() { 
		jamesBond = bond.bondRegex("(3(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase164() { 
		jamesBond = bond.bondRegex("(3)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase165() { 
		jamesBond = bond.bondRegex("(30");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase166() { 
		jamesBond = bond.bondRegex("(4(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase167() { 
		jamesBond = bond.bondRegex("(4)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase168() { 
		jamesBond = bond.bondRegex("(40");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase169() { 
		jamesBond = bond.bondRegex("(5(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase170() { 
		jamesBond = bond.bondRegex("(5)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase171() { 
		jamesBond = bond.bondRegex("(50");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase172() { 
		jamesBond = bond.bondRegex("(6(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase173() { 
		jamesBond = bond.bondRegex("(6)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase174() { 
		jamesBond = bond.bondRegex("(60");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase175() { 
		jamesBond = bond.bondRegex("(7(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase176() { 
		jamesBond = bond.bondRegex("(7)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase177() { 
		jamesBond = bond.bondRegex("(70");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase178() { 
		jamesBond = bond.bondRegex("(8(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase179() { 
		jamesBond = bond.bondRegex("(8)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase180() { 
		jamesBond = bond.bondRegex("(80");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase181() { 
		jamesBond = bond.bondRegex("(9(");
		assertFalse(jamesBond);
	}


	@Test
	public void testCase182() { 
		jamesBond = bond.bondRegex("(9)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase183() { 
		jamesBond = bond.bondRegex("(90");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase184() { 
		jamesBond = bond.bondRegex(")");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase185() { 
		jamesBond = bond.bondRegex(")(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase186() { 
		jamesBond = bond.bondRegex("))");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase187() { 
		jamesBond = bond.bondRegex(")0");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase188() { 
		jamesBond = bond.bondRegex("0");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase189() { 
		jamesBond = bond.bondRegex("0(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase190() { 
		jamesBond = bond.bondRegex("0)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase191() { 
		jamesBond = bond.bondRegex("00");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase192() { 
		jamesBond = bond.bondRegex("1(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase193() { 
		jamesBond = bond.bondRegex("1)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase194() { 
		jamesBond = bond.bondRegex("10");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase195() { 
		jamesBond = bond.bondRegex("2(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase196() { 
		jamesBond = bond.bondRegex("2)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase197() { 
		jamesBond = bond.bondRegex("20");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase198() { 
		jamesBond = bond.bondRegex("3(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase199() { 
		jamesBond = bond.bondRegex("3)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase200() { 
		jamesBond = bond.bondRegex("30");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase201() { 
		jamesBond = bond.bondRegex("4(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase202() { 
		jamesBond = bond.bondRegex("4)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase203() { 
		jamesBond = bond.bondRegex("40");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase204() { 
		jamesBond = bond.bondRegex("5(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase205() { 
		jamesBond = bond.bondRegex("5)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase206() { 
		jamesBond = bond.bondRegex("50");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase207() { 
		jamesBond = bond.bondRegex("6(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase208() { 
		jamesBond = bond.bondRegex("6)");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase209() { 
		jamesBond = bond.bondRegex("60");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase210() { 
		jamesBond = bond.bondRegex("7(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase211() { 
		jamesBond = bond.bondRegex("7)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase212() { 
		jamesBond = bond.bondRegex("70");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase213() { 
		jamesBond = bond.bondRegex("8(");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase214() { 
		jamesBond = bond.bondRegex("8)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase215() { 
		jamesBond = bond.bondRegex("80");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase216() { 
		jamesBond = bond.bondRegex("9(");
		assertFalse(jamesBond);
	}
	@Test
	public void testCase217() { 
		jamesBond = bond.bondRegex("9)");
		assertFalse(jamesBond);
	}

	@Test
	public void testCase218() { 
		jamesBond = bond.bondRegex("90");
		assertFalse(jamesBond);
	}



}
