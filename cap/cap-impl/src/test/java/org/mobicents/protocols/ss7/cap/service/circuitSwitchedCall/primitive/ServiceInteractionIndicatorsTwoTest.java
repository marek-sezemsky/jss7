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

package org.mobicents.protocols.ss7.cap.service.circuitSwitchedCall.primitive;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.mobicents.protocols.asn.AsnInputStream;
import org.mobicents.protocols.asn.AsnOutputStream;
import org.mobicents.protocols.ss7.inap.api.primitives.BothwayThroughConnectionInd;
import org.testng.annotations.Test;

/**
 *
 * @author sergey vetyutnev
 *
 */
public class ServiceInteractionIndicatorsTwoTest {

    public byte[] getData1() {
        return new byte[] { 48, 3, (byte) 130, 1, 0 };
    }

    @Test(groups = { "functional.decode", "circuitSwitchedCall.primitive" })
    public void testDecode() throws Exception {

        byte[] data = this.getData1();
        AsnInputStream ais = new AsnInputStream(data);
        ServiceInteractionIndicatorsTwoImpl elem = new ServiceInteractionIndicatorsTwoImpl();
        int tag = ais.readTag();
        elem.decodeAll(ais);
        assertEquals(elem.getBothwayThroughConnectionInd(), BothwayThroughConnectionInd.bothwayPathRequired);

        // TODO: implement full testing for CAP V4
    }

    @Test(groups = { "functional.encode", "circuitSwitchedCall.primitive" })
    public void testEncode() throws Exception {

        ServiceInteractionIndicatorsTwoImpl elem = new ServiceInteractionIndicatorsTwoImpl(null, null,
                BothwayThroughConnectionInd.bothwayPathRequired, null, false, null, null, null);
        AsnOutputStream aos = new AsnOutputStream();
        elem.encodeAll(aos);
        assertTrue(Arrays.equals(aos.toByteArray(), this.getData1()));

        // ForwardServiceInteractionInd forwardServiceInteractionInd,
        // BackwardServiceInteractionInd backwardServiceInteractionInd, BothwayThroughConnectionInd bothwayThroughConnectionInd,
        // ConnectedNumberTreatmentInd connectedNumberTreatmentInd, boolean nonCUGCall, HoldTreatmentIndicator
        // holdTreatmentIndicator,
        // CwTreatmentIndicator cwTreatmentIndicator, EctTreatmentIndicator ectTreatmentIndicator

        // TODO: implement full testing for CAP V4
    }
}
