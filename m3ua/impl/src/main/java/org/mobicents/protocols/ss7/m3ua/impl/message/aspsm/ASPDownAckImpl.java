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

package org.mobicents.protocols.ss7.m3ua.impl.message.aspsm;

import java.nio.ByteBuffer;

import org.mobicents.protocols.ss7.m3ua.impl.message.M3UAMessageImpl;
import org.mobicents.protocols.ss7.m3ua.impl.parameter.ParameterImpl;
import org.mobicents.protocols.ss7.m3ua.message.MessageClass;
import org.mobicents.protocols.ss7.m3ua.message.MessageType;
import org.mobicents.protocols.ss7.m3ua.message.aspsm.ASPDownAck;
import org.mobicents.protocols.ss7.m3ua.parameter.InfoString;
import org.mobicents.protocols.ss7.m3ua.parameter.Parameter;

/**
 *
 * @author amit bhayani
 *
 */
public class ASPDownAckImpl extends M3UAMessageImpl implements ASPDownAck {

    public ASPDownAckImpl() {
        super(MessageClass.ASP_STATE_MAINTENANCE, MessageType.ASP_DOWN_ACK, MessageType.S_ASP_DOWN_ACK);
    }

    public InfoString getInfoString() {
        return (InfoString) parameters.get(Parameter.INFO_String);
    }

    public void setInfoString(InfoString str) {
        if (str != null) {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    @Override
    protected void encodeParams(ByteBuffer buffer) {

        if (parameters.containsKey(Parameter.INFO_String)) {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }

}
