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
package br.poli.ecomp.convert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sillas
 */
public class NumeralTest {

    public NumeralTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of converter method, of class Numeral.
     */
    @Test
    public void testConverter() {
        Numeral num = new Numeral();
        assertEquals("0", num.converter("0", 2, 10));
        assertEquals("0", num.converter("0", 10, 2));
        assertEquals("0", num.converter("0", 16, 10));
        assertEquals("0", num.converter("0", 10, 16));
        assertEquals("0", num.converter("0", 16, 2));
        //Testando o 1
        assertEquals("1", num.converter("1", 2, 10));
        assertEquals("1", num.converter("1", 10, 2));
        assertEquals("1", num.converter("1", 16, 10));
        assertEquals("1", num.converter("1", 10, 16));
        assertEquals("1", num.converter("1", 16, 2));
        //Testando o 2
        assertEquals("2", num.converter("10", 2, 10));
        assertEquals("10", num.converter("2", 10, 2));
        assertEquals("2", num.converter("2", 16, 10));
        assertEquals("2", num.converter("2", 10, 16));
        assertEquals("10", num.converter("2", 16, 2));
        //Testando o 3
        assertEquals("3", num.converter("11", 2, 10));
        assertEquals("11", num.converter("3", 10, 2));
        assertEquals("3", num.converter("3", 16, 10));
        assertEquals("3", num.converter("3", 10, 16));
        assertEquals("11", num.converter("3", 16, 2));
        //Testando o 4
        assertEquals("4", num.converter("100", 2, 10));
        assertEquals("100", num.converter("4", 10, 2));
        assertEquals("4", num.converter("4", 16, 10));
        assertEquals("4", num.converter("4", 10, 16));
        assertEquals("100", num.converter("4", 16, 2));
        //Testando o 5
        assertEquals("5", num.converter("101", 2, 10));
        assertEquals("101", num.converter("5", 10, 2));
        assertEquals("5", num.converter("5", 16, 10));
        assertEquals("5", num.converter("5", 10, 16));
        assertEquals("101", num.converter("5", 16, 2));
        //Testando o 6
        assertEquals("6", num.converter("110", 2, 10));
        assertEquals("110", num.converter("6", 10, 2));
        assertEquals("6", num.converter("6", 16, 10));
        assertEquals("6", num.converter("6", 10, 16));
        assertEquals("110", num.converter("6", 16, 2));
        //Testando o 7
        assertEquals("7", num.converter("111", 2, 10));
        assertEquals("111", num.converter("7", 10, 2));
        assertEquals("7", num.converter("7", 16, 10));
        assertEquals("7", num.converter("7", 10, 16));
        assertEquals("111", num.converter("7", 16, 2));
        //Testando o 8
        assertEquals("8", num.converter("1000", 2, 10));
        assertEquals("1000", num.converter("8", 10, 2));
        assertEquals("8", num.converter("8", 16, 10));
        assertEquals("8", num.converter("8", 10, 16));
        assertEquals("1000", num.converter("8", 16, 2));
        //Testando o 9
        assertEquals("9", num.converter("1001", 2, 10));
        assertEquals("1001", num.converter("9", 10, 2));
        assertEquals("9", num.converter("9", 16, 10));
        assertEquals("9", num.converter("9", 10, 16));
        assertEquals("1001", num.converter("9", 16, 2));
        //Testando o 10
        assertEquals("10", num.converter("1010", 2, 10));
        assertEquals("1010", num.converter("10", 10, 2));
        assertEquals("10", num.converter("A", 16, 10));
        assertEquals("A", num.converter("10", 10, 16));
        assertEquals("1010", num.converter("A", 16, 2));
        //Testando o 11
        assertEquals("11", num.converter("1011", 2, 10));
        assertEquals("1011", num.converter("11", 10, 2));
        assertEquals("11", num.converter("B", 16, 10));
        assertEquals("B", num.converter("11", 10, 16));
        assertEquals("1011", num.converter("B", 16, 2));
        //Testando o 12
        assertEquals("12", num.converter("1100", 2, 10));
        assertEquals("1100", num.converter("12", 10, 2));
        assertEquals("12", num.converter("C", 16, 10));
        assertEquals("C", num.converter("12", 10, 16));
        assertEquals("1100", num.converter("C", 16, 2));
        //Testando o 13
        assertEquals("13", num.converter("1101", 2, 10));
        assertEquals("1101", num.converter("13", 10, 2));
        assertEquals("13", num.converter("D", 16, 10));
        assertEquals("D", num.converter("13", 10, 16));
        assertEquals("1101", num.converter("D", 16, 2));
        //Testando o 14
        assertEquals("14", num.converter("1110", 2, 10));
        assertEquals("1110", num.converter("14", 10, 2));
        assertEquals("14", num.converter("E", 16, 10));
        assertEquals("E", num.converter("14", 10, 16));
        assertEquals("1110", num.converter("E", 16, 2));
        //Testando o 15
        assertEquals("15", num.converter("1111", 2, 10));
        assertEquals("1111", num.converter("15", 10, 2));
        assertEquals("15", num.converter("F", 16, 10));
        assertEquals("F", num.converter("15", 10, 16));
        assertEquals("1111", num.converter("F", 16, 2));
        //Testando o 16
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("10", num.converter("16", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 17
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("11", num.converter("17", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 18
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("10", num.converter("16", 10, 16));
        assertEquals("12", num.converter("18", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 19
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("A1", num.converter("161", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 20
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("10", num.converter("16", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 21
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("10", num.converter("16", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        //Testando o 22
        assertEquals("16", num.converter("10000", 2, 10));
        assertEquals("10000", num.converter("16", 10, 2));
        assertEquals("16", num.converter("10", 16, 10));
        assertEquals("10", num.converter("16", 10, 16));
        assertEquals("10000", num.converter("10", 16, 2));
        assertEquals("10", num.converter("10000", 2, 16));
        
        
        assertEquals("120", num.converter("170", 8, 10));
        assertEquals("320", num.converter("500", 8, 10));
        assertEquals("12", num.converter("A", 16, 8));
        assertEquals("241", num.converter("A1", 16, 8));
        
    }

}
