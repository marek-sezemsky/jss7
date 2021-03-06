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

package org.mobicents.protocols.ss7.inap.api.service.circuitSwitchedCall.primitive;

import org.mobicents.protocols.ss7.map.api.primitives.AddressNature;
import org.mobicents.protocols.ss7.map.api.primitives.AddressString;
import org.mobicents.protocols.ss7.map.api.primitives.NumberingPlan;

/**
*
CalledPartyBCDNumber {PARAMETERS-BOUND : bound} ::= OCTET STRING (SIZE(
bound.&minCalledPartyBCDNumberLength ..
bound.&maxCalledPartyBCDNumberLength))
-- Indicates the Called Party Number, including service selection information. Refer to GSM 04.08
-- for encoding. This data type carries only the "type of number", "numbering plan
-- identification" and "number digit" fields defined in GSM 04.08;
-- it does not carry the "called party
-- BCD number IEI" or "length of called party BCD number contents".

*
* minCalledPartyBCDNumberLength ::= 1 maxCalledPartyBCDNumberLength ::= 41
*
*
* @author sergey vetyutnev
*
*/
public interface CalledPartyBCDNumber extends AddressString {

    byte[] getData();

    AddressNature getAddressNature();

    NumberingPlan getNumberingPlan();

    String getAddress();

    boolean isExtension();

}
