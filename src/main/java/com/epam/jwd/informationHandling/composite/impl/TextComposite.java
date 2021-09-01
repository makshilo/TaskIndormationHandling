package com.epam.jwd.informationHandling.composite.impl;

import com.epam.jwd.informationHandling.composite.TextComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponentComposite
{
    private final List<TextComponentComposite> paragraphs = new ArrayList<>();

    @Override
    public void addTextComponent(TextComponentComposite textComponent)
    {
        this.paragraphs.add(textComponent);
    }

    @Override
    public void removeTextComponent(TextComponentComposite textComponent)
    {
        this.paragraphs.remove(textComponent);
    }
}