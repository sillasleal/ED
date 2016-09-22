/*
 * Copyright (C) 2016 sillas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.poli.ecomp.expressao;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sillas
 */
public class PosFixaTest {
    
    public PosFixaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calc method, of class PosFixa.
     * @throws java.lang.Exception
     */
    @Test
    public void testCalc() throws Exception {
        System.out.println("calc");
        PosFixa pos = new PosFixa();
        assertEquals(16, pos.avaliar("5 3 + 6 * 2 1 + /"));
        assertEquals(24, pos.avaliar("1 2 + 3 4 - + 5 6 + 7 8 - - *"));
        assertEquals(16, pos.avaliar("1 2 + 3 4 - + 5 6 + 7 8 - - * 8-"));
    }
    
}
