/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.protocols.ss7.map.api.primitives;

import java.io.Serializable;

/**
 *
 PLMN-Id ::= OCTET STRING (SIZE (3)) -- The internal structure is defined as follows: -- octet 1 bits 4321 Mobile Country Code
 * 1st digit -- bits 8765 Mobile Country Code 2nd digit -- octet 2 bits 4321 Mobile Country Code 3rd digit -- bits 8765 Mobile
 * Network Code 3rd digit -- or filler (1111) for 2 digit MNCs -- octet 3 bits 4321 Mobile Network Code 1st digit -- bits 8765
 * Mobile Network Code 2nd digit
 *
 *
 * @author sergey vetyutnev
 *
 */
public interface PlmnId extends Serializable {

    byte[] getData();

    int getMcc();

    int getMnc();

}
