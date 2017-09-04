package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone_cc3002_plt.*;

public class HeartStoneTest {
	private ICard ass;
	private ICard dru;
	private ICard hea;
	private ICard hun;
	private ICard kni;
	private ICard mag;
	private ICard pal;
	private ICard sha;
	private ICard war;
	
	@Before
	public void setUp() throws Exception {
		ass=new Assassin(100,10);
		dru=new Druid(100,10);
		hea=new Healer(100,10);
		hun=new Hunter(100,10);
		kni=new Knight(100,10);
		mag=new Mage(100,10);
		pal=new Paladin(100,10);
		sha=new Shaman(100,10);
		war=new Warlock(100,10);
	}

	@Test
	public void testAssassin() {
		//prueba de vida y atributos basicos
		assertTrue(ass.isAlive());
		assertEquals(ass.getAD(),10,0);
		assertEquals(ass.getDR(),0,0);
		assertEquals(ass.getLP(),100,0);
		assertEquals(ass.getName(),"Assassin");
		//prueba con interacciones especiales
		war.attack(ass);
		assertEquals(ass.getDR(),20,0);
		dru.attack(ass);
		assertEquals(ass.getDR(),20,0);
		assertEquals(ass.getDR(),20,0);
		assertEquals(ass.getAD(),15,0);
		//prueba con interacciones normales
		hea.attack(ass);
		assertEquals(ass.getDR(),15,0);
		hun.attack(ass);
		assertEquals(ass.getDR(),25,0);
		kni.attack(ass);
		assertEquals(ass.getDR(),35,0);
		mag.attack(ass);
		assertEquals(ass.getDR(),45,0);
		pal.attack(ass);
		assertEquals(ass.getAD(),18.33,0.1);
		assertEquals(ass.getDR(),41.67,0.1);
		sha.attack(ass);
		assertEquals(ass.getDR(),45,0.1);
		assertEquals(ass.getAD(),15,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(ass);
		hun.attack(ass);
		hun.attack(ass);
		hun.attack(ass);
		hun.attack(ass);
		hun.attack(ass);
		assertEquals(ass.getDR(),105,0.1);
		assertFalse(ass.isAlive());
		hun.attack(ass);
		assertEquals(ass.getDR(),105,0.1);
		hea.attack(ass);
		assertFalse(ass.isAlive());
		assertEquals(ass.getDR(),105,0.1);
	}
	@Test
	public void testDruid() {
		//prueba de vida y atributos basicos
		assertTrue(dru.isAlive());
		assertEquals(dru.getAD(),10,0);
		assertEquals(dru.getDR(),0,0);
		assertEquals(dru.getLP(),100,0);
		assertEquals(dru.getName(),"Druid");
		//prueba con interacciones especiales
		sha.attack(dru);
		assertEquals(dru.getAD(), 3.3,0.1);
		assertEquals(dru.getDR(),6.6,0.1);
		pal.attack(dru);
		assertEquals(dru.getAD(),10,0.1);
		assertEquals(dru.getDR(),0,0.1);
		//prueba con interacciones normales
		hun.attack(dru);
		assertEquals(dru.getDR(),10,0);
		hea.attack(dru);
		assertEquals(dru.getDR(),5,0.1);
		kni.attack(dru);
		assertEquals(dru.getDR(),15,0);
		mag.attack(dru);
		assertEquals(dru.getDR(),25,0);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		hun.attack(dru);
		assertEquals(dru.getDR(),105,0.1);
		assertFalse(dru.isAlive());
		hun.attack(dru);
		assertEquals(dru.getDR(),105,0.1);
		hea.attack(dru);
		assertFalse(dru.isAlive());
		assertEquals(dru.getDR(),105,0.1);
	}
	@Test
	public void testHealer() {
		//prueba de vida y atributos basicos
		assertTrue(hea.isAlive());
		assertEquals(hea.getAD(),10,0);
		assertEquals(hea.getDR(),0,0);
		assertEquals(hea.getLP(),100,0);
		assertEquals(hea.getName(),"Healer");
		//prueba con interacciones especiales
		ass.attack(hea);
		assertEquals(hea.getDR(),20,0);
		pal.attack(hea);
		assertEquals(hea.getDR(),13.3,0.1);
		assertEquals(hea.getAD(),16.6,0.1);
		//prueba con interacciones normales
		hun.attack(hea);
		assertEquals(hea.getDR(),23.3,0.1);
		kni.attack(hea);
		assertEquals(hea.getDR(),33.3,0.1);
		mag.attack(hea);
		assertEquals(hea.getDR(),43.3,0.1);
		sha.attack(hea);
		assertEquals(hea.getDR(),46.6,0.1);
		assertEquals(hea.getAD(),13.3,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(hea);
		hun.attack(hea);
		hun.attack(hea);
		hun.attack(hea);
		hun.attack(hea);
		hun.attack(hea);
		assertEquals(hea.getDR(),106.6,0.1);
		assertFalse(hea.isAlive());
		hun.attack(hea);
		assertEquals(hea.getDR(),106.6,0.1);
	}
	@Test
	public void testHunter() {
		//prueba de vida y atributos basicos
		assertTrue(hun.isAlive());
		assertEquals(hun.getAD(),10,0);
		assertEquals(hun.getDR(),0,0);
		assertEquals(hun.getLP(),100,0);
		assertEquals(hun.getName(),"Hunter");
		//prueba con interacciones especiales
		dru.attack(hun);
		assertEquals(hun.getDR(),5,0);
		mag.attack(hun);
		assertEquals(hun.getDR(),25,0);
		//prueba con interacciones normales
		hea.attack(hun);
		assertEquals(hun.getDR(),20,0);
		kni.attack(hun);
		assertEquals(hun.getDR(),30,0);
		pal.attack(hun);
		assertEquals(hun.getAD(),13.3,0.1);
		assertEquals(hun.getDR(),26.6,0.1);
		sha.attack(hun);
		assertEquals(hun.getDR(),30,0.1);
		assertEquals(hun.getAD(),10,0.1);
		war.attack(hun);
		assertEquals(hun.getDR(),40,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		war.attack(hun);
		war.attack(hun);
		war.attack(hun);
		war.attack(hun);
		war.attack(hun);
		war.attack(hun);
		assertEquals(hun.getDR(),100,0.1);
		assertFalse(hun.isAlive());
		war.attack(hun);
		assertEquals(hun.getDR(),100,0.1);
		hea.attack(hun);
		assertFalse(hun.isAlive());
		assertEquals(hun.getDR(),100,0.1);
		
	}
	@Test
	public void testKnight() {
		//prueba de vida y atributos basicos
		assertTrue(kni.isAlive());
		assertEquals(kni.getAD(),10,0);
		assertEquals(kni.getDR(),0,0);
		assertEquals(kni.getLP(),100,0);
		assertEquals(kni.getName(),"Knight");
		//prueba con interacciones especiales
		hun.attack(kni);
		assertEquals(kni.getDR(),20,0);
		ass.attack(kni);
		assertEquals(kni.getDR(),25,0);
		//prueba con interacciones normales
		hea.attack(kni);
		assertEquals(kni.getDR(),20,0);
		mag.attack(kni);
		assertEquals(kni.getDR(),30,0);
		pal.attack(kni);
		assertEquals(kni.getAD(),13.33,0.1);
		assertEquals(kni.getDR(),26.67,0.1);
		sha.attack(kni);
		assertEquals(kni.getDR(),30,0.1);
		assertEquals(kni.getAD(),10,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(kni);
		hun.attack(kni);
		hun.attack(kni);
		hun.attack(kni);
		assertEquals(kni.getDR(),110,0.1);
		assertFalse(kni.isAlive());
		hun.attack(kni);
		assertEquals(kni.getDR(),110,0.1);
		hea.attack(kni);
		assertFalse(kni.isAlive());
		assertEquals(kni.getDR(),110,0.1);
	}
	@Test
	public void testMage() {
		//prueba de vida y atributos basicos
		assertTrue(mag.isAlive());
		assertEquals(mag.getAD(),10,0);
		assertEquals(mag.getDR(),0,0);
		assertEquals(mag.getLP(),100,0);
		assertEquals(mag.getName(),"Mage");
		//prueba con interacciones especiales
		war.attack(mag);
		assertEquals(mag.getDR(),5,0);
		ass.attack(mag);
		assertEquals(mag.getDR(),25,0);
		//prueba con interacciones normales
		hea.attack(mag);
		assertEquals(mag.getDR(),20,0);
		kni.attack(mag);
		assertEquals(mag.getDR(),30,0);
		pal.attack(mag);
		assertEquals(mag.getAD(),13.33,0.1);
		assertEquals(mag.getDR(),26.67,0.1);
		sha.attack(mag);
		assertEquals(mag.getDR(),30,0.1);
		assertEquals(mag.getAD(),10,0.1);
		hun.attack(mag);
		assertEquals(mag.getDR(),40,0);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(mag);
		hun.attack(mag);
		hun.attack(mag);
		hun.attack(mag);
		hun.attack(mag);
		hun.attack(mag);
		assertEquals(mag.getDR(),100,0.1);
		assertFalse(mag.isAlive());
		hun.attack(mag);
		assertEquals(mag.getDR(),100,0.1);
		hea.attack(mag);
		assertFalse(mag.isAlive());
		assertEquals(mag.getDR(),100,0.1);
	}
	@Test
	public void testPaladin() {
		//prueba de vida y atributos basicos
		assertTrue(pal.isAlive());
		assertEquals(pal.getAD(),10,0);
		assertEquals(pal.getDR(),0,0);
		assertEquals(pal.getLP(),100,0);
		assertEquals(pal.getName(),"Paladin");
		//prueba con interacciones especiales
		mag.attack(pal);
		assertEquals(pal.getDR(),20,0);
		kni.attack(pal);
		assertEquals(pal.getDR(),25,0);
		//prueba con interacciones normales
		hea.attack(pal);
		assertEquals(pal.getDR(),20,0);
		hun.attack(pal);
		assertEquals(pal.getDR(),30,0);
		sha.attack(pal);
		assertEquals(pal.getDR(),33.3,0.1);
		assertEquals(pal.getAD(),6.7,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(pal);
		hun.attack(pal);
		hun.attack(pal);
		hun.attack(pal);
		hun.attack(pal);
		hun.attack(pal);
		hun.attack(pal);
		assertEquals(pal.getDR(),103.3,0.1);
		assertFalse(pal.isAlive());
		hun.attack(pal);
		assertEquals(pal.getDR(),103.3,0.1);
		hea.attack(pal);
		assertFalse(pal.isAlive());
		assertEquals(pal.getDR(),103.3,0.1);
	}
	@Test
	public void testShaman() {
		//prueba de vida y atributos basicos
		assertTrue(sha.isAlive());
		assertEquals(sha.getAD(),10,0);
		assertEquals(sha.getDR(),0,0);
		assertEquals(sha.getLP(),100,0);
		assertEquals(sha.getName(),"Shaman");
		//prueba con interacciones especiales
		hun.attack(sha);
		assertEquals(sha.getDR(),20,0);
		//prueba con interacciones normales
		hea.attack(sha);
		assertEquals(sha.getDR(),15,0);
		kni.attack(sha);
		assertEquals(sha.getDR(),25,0);
		mag.attack(sha);
		assertEquals(sha.getDR(),35,0);
		pal.attack(sha);
		assertEquals(sha.getAD(),13.3,0.1);
		assertEquals(sha.getDR(),31.7,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(sha);
		hun.attack(sha);
		hun.attack(sha);
		hun.attack(sha);
		assertEquals(sha.getDR(),111.7,0.1);
		assertFalse(sha.isAlive());
		hun.attack(sha);
		assertEquals(sha.getDR(),111.7,0.1);
		hea.attack(sha);
		assertFalse(sha.isAlive());
		assertEquals(sha.getDR(),111.7,0.1);
	}
	@Test
	public void testWarlock() {
		//prueba de vida y atributos basicos
		assertTrue(war.isAlive());
		assertEquals(war.getAD(),10,0);
		assertEquals(war.getDR(),0,0);
		assertEquals(war.getLP(),100,0);
		assertEquals(war.getName(),"Warlock");
		//prueba con interacciones especiales
		hea.attack(war);
		assertEquals(war.getDR(),10,0);
		sha.attack(war);
		assertEquals(war.getDR(),16.6,0.1);
		assertEquals(war.getAD(),3.3,0.1);
		//prueba con interacciones normales
		hun.attack(war);
		assertEquals(war.getDR(),26.6,0.1);
		kni.attack(war);
		assertEquals(war.getDR(),36.6,0.1);
		mag.attack(war);
		assertEquals(war.getDR(),46.6,0.1);
		pal.attack(war);
		assertEquals(war.getAD(),6.7,0.1);
		assertEquals(war.getDR(),43.3,0.1);
		//matamos para verificar isAlive y posibles interacciones posteriores
		hun.attack(war);
		hun.attack(war);
		hun.attack(war);
		hun.attack(war);
		hun.attack(war);
		hun.attack(war);
		assertEquals(war.getDR(),103.3,0.1);
		assertFalse(war.isAlive());
		hun.attack(war);
		assertEquals(war.getDR(),103.3,0.1);
	}

}
