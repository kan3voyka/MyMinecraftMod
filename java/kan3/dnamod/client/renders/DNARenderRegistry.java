package kan3.dnamod.client.renders;

import kan3.dnamod.entities.Mummy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class DNARenderRegistry 
{
	public static void registryEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(Mummy.class, new MummyRender.RenderFactory());
	}
}
