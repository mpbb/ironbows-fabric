package com.mpbb.ironbows.fabric.mixin;

import com.mpbb.ironbows.fabric.Main;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public class FovMixin {
	@Inject(method = "getFovMultiplier", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf"))
	private boolean init(ItemStack itemStack, Item item) {
		System.out.println(item.toString());
		return true;
	}
}
