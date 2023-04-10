// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import jdk.internal.misc.Unsafe;

import sun.util.logging.PlatformLogger;
public class Screen extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 128; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public Screen(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public Screen() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public XExtData get_ext_data(int index) { log.finest(""); return (Native.getLong(pData+0) != 0)?(new XExtData(Native.getLong(pData+0)+index*32)):(null); }
	public long get_ext_data() { log.finest("");return Native.getLong(pData+0); }
	public void set_ext_data(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public long get_display(int index) { log.finest(""); return Native.getLong(pData+8)+index*Native.getLongSize(); }
	public long get_display() { log.finest("");return Native.getLong(pData+8); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData + 8, v); }
	public long get_root() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_root(long v) { log.finest(""); Native.putLong(pData+16, v); }
	public int get_width() { log.finest("");return (Native.getInt(pData+24)); }
	public void set_width(int v) { log.finest(""); Native.putInt(pData+24, v); }
	public int get_height() { log.finest("");return (Native.getInt(pData+28)); }
	public void set_height(int v) { log.finest(""); Native.putInt(pData+28, v); }
	public int get_mwidth() { log.finest("");return (Native.getInt(pData+32)); }
	public void set_mwidth(int v) { log.finest(""); Native.putInt(pData+32, v); }
	public int get_mheight() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_mheight(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public int get_ndepths() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_ndepths(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public Depth get_depths(int index) { log.finest(""); return (Native.getLong(pData+48) != 0)?(new Depth(Native.getLong(pData+48)+index*16)):(null); }
	public long get_depths() { log.finest("");return Native.getLong(pData+48); }
	public void set_depths(long v) { log.finest(""); Native.putLong(pData + 48, v); }
	public int get_root_depth() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_root_depth(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public Visual get_root_visual(int index) { log.finest(""); return (Native.getLong(pData+64) != 0)?(new Visual(Native.getLong(pData+64)+index*56)):(null); }
	public long get_root_visual() { log.finest("");return Native.getLong(pData+64); }
	public void set_root_visual(long v) { log.finest(""); Native.putLong(pData + 64, v); }
	public long get_default_gc() { log.finest("");return (Native.getLong(pData+72)); }
	public void set_default_gc(long v) { log.finest(""); Native.putLong(pData+72, v); }
	public long get_cmap() { log.finest("");return (Native.getLong(pData+80)); }
	public void set_cmap(long v) { log.finest(""); Native.putLong(pData+80, v); }
	public long get_white_pixel() { log.finest("");return (Native.getLong(pData+88)); }
	public void set_white_pixel(long v) { log.finest(""); Native.putLong(pData+88, v); }
	public long get_black_pixel() { log.finest("");return (Native.getLong(pData+96)); }
	public void set_black_pixel(long v) { log.finest(""); Native.putLong(pData+96, v); }
	public int get_max_maps() { log.finest("");return (Native.getInt(pData+104)); }
	public void set_max_maps(int v) { log.finest(""); Native.putInt(pData+104, v); }
	public int get_min_maps() { log.finest("");return (Native.getInt(pData+108)); }
	public void set_min_maps(int v) { log.finest(""); Native.putInt(pData+108, v); }
	public int get_backing_store() { log.finest("");return (Native.getInt(pData+112)); }
	public void set_backing_store(int v) { log.finest(""); Native.putInt(pData+112, v); }
	public boolean get_save_unders() { log.finest("");return (Native.getBool(pData+116)); }
	public void set_save_unders(boolean v) { log.finest(""); Native.putBool(pData+116, v); }
	public long get_root_input_mask() { log.finest("");return (Native.getLong(pData+120)); }
	public void set_root_input_mask(long v) { log.finest(""); Native.putLong(pData+120, v); }


	String getName() {
		return "Screen"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(800);

		ret.append("ext_data = ").append( get_ext_data() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("root = ").append( get_root() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("height = ").append( get_height() ).append(", ");
		ret.append("mwidth = ").append( get_mwidth() ).append(", ");
		ret.append("mheight = ").append( get_mheight() ).append(", ");
		ret.append("ndepths = ").append( get_ndepths() ).append(", ");
		ret.append("depths = ").append( get_depths() ).append(", ");
		ret.append("root_depth = ").append( get_root_depth() ).append(", ");
		ret.append("root_visual = ").append( get_root_visual() ).append(", ");
		ret.append("default_gc = ").append( get_default_gc() ).append(", ");
		ret.append("cmap = ").append( get_cmap() ).append(", ");
		ret.append("white_pixel = ").append( get_white_pixel() ).append(", ");
		ret.append("black_pixel = ").append( get_black_pixel() ).append(", ");
		ret.append("max_maps = ").append( get_max_maps() ).append(", ");
		ret.append("min_maps = ").append( get_min_maps() ).append(", ");
		ret.append("backing_store = ").append( get_backing_store() ).append(", ");
		ret.append("save_unders = ").append( get_save_unders() ).append(", ");
		ret.append("root_input_mask = ").append( get_root_input_mask() ).append(", ");
		return ret.toString();
	}


}



