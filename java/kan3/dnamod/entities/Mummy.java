package kan3.dnamod.entities;

import kan3.dnamod.init.DNAEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class Mummy extends ZombieEntity 
{

	@SuppressWarnings("unchecked")
	public Mummy(EntityType<? extends MonsterEntity> type, World worldIn) 
	{
		super((EntityType<? extends ZombieEntity>) DNAEntities.MUMMY, worldIn);
	}
	
	@Override
	protected void registerGoals() 
	{
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.0d));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.4d, true));
		
	}
	
	@Override
	protected void registerAttributes() 
	{
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0d);
		this.getAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(2.0d);
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(24.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0d);
	}
}
