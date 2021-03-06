/**
 * Copyright 2021 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.steelarmortoolsweapons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import de.markusbordihn.materialelements.item.ModArmorMaterials;
import de.markusbordihn.materialelements.item.ModTiers;
import de.markusbordihn.steelarmortoolsweapons.Constants;
import de.markusbordihn.steelarmortoolsweapons.Annotations.TemplateEntryPoint;

public class ModItems {

  protected ModItems() {}

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

  @TemplateEntryPoint("Register Items")

  // Steel Weapons
  public static final RegistryObject<Item> STEEL_SWORD =
      ITEMS.register("steel_sword", () -> new SwordItem(ModTiers.STEEL, 3, -2.4F,
          (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

  public static final RegistryObject<Item> STEEL_CROSSBOW =
      ITEMS.register("steel_crossbow", () -> new CrossbowItem(
          (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).durability(435)));

  // Steel Tools
  public static final RegistryObject<Item> STEEL_SHOVEL =
      ITEMS.register("steel_shovel", () -> new ShovelItem(ModTiers.STEEL, 1.5F, -3.0F,
          (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

  public static final RegistryObject<Item> STEEL_PICKAXE =
      ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModTiers.STEEL, 1, -2.8F,
          (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

  public static final RegistryObject<Item> STEEL_AXE =
      ITEMS.register("steel_axe", () -> new AxeItem(ModTiers.STEEL, 6.0F, -3.1F,
          (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

  public static final RegistryObject<Item> STEEL_HOE =
      ITEMS.register("steel_hoe", () -> new HoeItem(ModTiers.STEEL, -2, -1.0F,
          (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

  // Steel Armor
  public static final RegistryObject<Item> STEEL_BOOTS =
      ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
          (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

  public static final RegistryObject<Item> STEEL_HELMET =
      ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterials.STEEL,
          EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

  public static final RegistryObject<Item> STEEL_LEGGINGS =
      ITEMS.register("steel_leggings", () -> new ArmorItem(ModArmorMaterials.STEEL,
          EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

  public static final RegistryObject<Item> STEEL_CHESTPLATE =
      ITEMS.register("steel_chestplate", () -> new ArmorItem(ModArmorMaterials.STEEL,
          EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

  @TemplateEntryPoint("Register Block Items")

  private static final String MINECRAFT_FORGE_TEMPLATE =
      "https://github.com/MarkusBordihn/minecraft-forge-template";
}
