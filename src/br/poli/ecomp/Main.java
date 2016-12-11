/*
 * Copyright (C) 2016 Sillas S. Leal<sillas.s.leal@gmail.com>
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
package br.poli.ecomp;

import br.poli.ecomp.quewe.Quewe;

/**
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Quewe q = new Quewe();
            q.enquewe(10);
            q.enquewe(20);
            q.enquewe(30);
            q.enquewe(40);
            q.enquewe(50);
//            System.out.println(q);
//            q.dequewe();
            System.out.println(q);
            System.out.println(q.reverse());
//            System.out.println(q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
