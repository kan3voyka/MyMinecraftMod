package kan3.dnamod.client.renders;

import kan3.dnamod.DNAModRegistries;
import kan3.dnamod.client.models.MummyModel;
import kan3.dnamod.entities.Mummy;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class MummyRender extends LivingRenderer<Mummy, MummyModel>
{
	public MummyRender(EntityRendererManager manager) 
	{
		super(manager, new MummyModel(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Mummy entity) 
	{
		return DNAModRegistries.location("textures/entity/mummy.png");
	}

	public static class RenderFactory implements IRenderFactory<Mummy>
	{
		@Override
		public EntityRenderer<? super Mummy> createRenderFor(EntityRendererManager manager) 
		{
			return new MummyRender(manager);
		}		
	}
}
