package com.epam.jwd.informationHandling.composite.impl;

import com.epam.jwd.informationHandling.composite.TextComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class LexemmesComposite implements TextComponentComposite
{
    private final List<TextComponentComposite> words = new ArrayList<>();
    @Override
    public void addTextComponent(TextComponentComposite textComponent)
    {
        this.words.add(textComponent);
    }

    @Override
    public void removeTextComponent(TextComponentComposite textComponent)
    {
        this.words.remove(textComponent);
    }
}
