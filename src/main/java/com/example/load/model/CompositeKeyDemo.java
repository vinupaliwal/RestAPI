package com.example.load.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeKeyDemo  implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private long loadId;
	    private long shipperId;
	    
	    public CompositeKeyDemo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CompositeKeyDemo(long loadId, long shipperId) {
	        this.loadId = loadId;
	        this.shipperId = shipperId;
	    }
		@Override
		public int hashCode() {
			return Objects.hash(loadId, shipperId);
		}
		public long getLoadId() {
			return loadId;
		}
		public void setLoadId(long loadId) {
			this.loadId = loadId;
		}
		public long getShipperId() {
			return shipperId;
		}
		public void setShipperId(long shipperId) {
			this.shipperId = shipperId;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CompositeKeyDemo other = (CompositeKeyDemo) obj;
			return loadId == other.loadId && shipperId == other.shipperId;
		}
	}

